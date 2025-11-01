package com.app.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class PollOptionVote {
    private String voteOption;
    private Long voteCount = 0L;
}
