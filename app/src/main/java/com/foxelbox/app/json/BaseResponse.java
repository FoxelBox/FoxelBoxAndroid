package com.foxelbox.app.json;

public class BaseResponse {
    public BaseResponse() { }

    public String message = null;
    public boolean retry = false;
    public boolean success = false;
    public String session_id = null;
}