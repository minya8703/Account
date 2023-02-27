package com.example.account.dto;

import io.reactivex.rxjava3.annotations.BackpressureSupport;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInfo {
    private String accountNumber;
    private Long balance;

}
