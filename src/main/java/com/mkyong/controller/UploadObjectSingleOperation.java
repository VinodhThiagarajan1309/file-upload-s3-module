package com.mkyong.controller;

/**
 * Created by vthiagarajan on 9/10/17.
 */
import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class UploadObjectSingleOperation {
    private static String bucketName     = "jonsnow-vinodh";
    private static String keyName        = "Believer.mp3";
    private static String uploadFileName = "/Users/vthiagarajan/Downloads/Imagine-Dragons.mp3";

    public static void main(String[] args) throws IOException {
    }
}