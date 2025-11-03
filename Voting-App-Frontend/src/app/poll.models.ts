export interface PollOptionVote{
      voteOption : string;
      voteCount : number;
}

export interface Poll {
      id : number;
      question : string;
      options : PollOptionVote[];
}
