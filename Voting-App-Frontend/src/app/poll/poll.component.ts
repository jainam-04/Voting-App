import { Component, OnInit } from '@angular/core';
import { Poll } from '../poll.models';
import { PollService } from '../poll.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-poll',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './poll.component.html',
  styleUrl: './poll.component.css',
})

export class PollComponent implements OnInit {
  newPoll: Poll = {
    id: 0,
    question: '',
    options: [
      {
        voteOption: '',
        voteCount: 0
      },
      {
        voteOption: '',
        voteCount: 0
      }
    ]
  };

  polls: Poll[] = [];

  constructor(private service: PollService){}

  ngOnInit(): void {
      this.loadPolls();
  }

  loadPolls(){
    this.service.getPolls().subscribe({
      next: (data) => {
        this.polls = data;
        console.log("Polls Loaded Successfully");
      },
      error: (error) => {
        console.error("Error fetching polls: ", error);
      }
    });
  }

  trackByIndex(index: number): number{
    return index;
  }

  createPoll(){
    this.service.createPoll(this.newPoll).subscribe({
      next: (createdPoll) => {
        this.polls.push(createdPoll);
        this.resetPoll();
        console.log("Poll Created Successfully");
      },
      error: (error) => {
        console.error("Error creating in poll: ", error);
      }
    });
  }

  resetPoll(){
    this.newPoll = {
      id: 0,
      question: '',
      options: [
        {
          voteOption: '',
          voteCount: 0
        },
        {
          voteOption: '',
          voteCount: 0
        }
      ]
    };
  }

  vote(pollId: number, optionIndex: number){
    this.service.vote(pollId, optionIndex).subscribe({
      next: () => {
        const poll = this.polls.find((p) => p.id === pollId);
        if(poll){
          poll.options[optionIndex].voteCount += 1;
          console.log("Poll Voting Successful")
        }
        else{
          console.error("Poll not found");
        }
      },
      error: (error) => {
        console.error("Error in voting the poll: ", error);
      }
    });
  }
}
