package com.loja.service;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.stereotype.Service;

@Service
public class EncryptService {

     public String encrypt(String value){

        String sha1 = "";

        try{
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(value.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));

		} catch (Exception e){
		
		}

        return sha1;
    }

}
