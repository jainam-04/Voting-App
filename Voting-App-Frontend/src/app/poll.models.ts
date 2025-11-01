export interface PollOptionVote{
      optionText : string;
      voteCount : number;
}

export interface Poll {
      id : number;
      question : string;
      options : PollOptionVote[];
}
