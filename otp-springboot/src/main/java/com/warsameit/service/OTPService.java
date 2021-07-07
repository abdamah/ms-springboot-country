package com.warsameit.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.DecimalFormat;
import java.util.Random;

@Service
public class OTPService {
    //TODO: USE GUAVA API FOR OTP GENERATION.

    /**
     * There are varies api's for OTP/TOTP generation
     * There we use guava api .
     */

    public Long generateOTP() {

        return getOTP("0000");
    }

    // generate OTP data

    private long getOTP(String pattern) {

        String otp = new DecimalFormat(StringUtils.isEmpty(pattern) ? "000000" : pattern)
                .format(new Random().nextInt(999999)).trim();
        return Long.parseLong(otp);
    }
}
