package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface LogInService {


    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @POST("login/virtual-signin")
    Call<PostSignInAdminResponse> signInAdminCall(@Body PostSignInAdminRequest postSignInAdminRequest);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDEwLCJwaG9uZSI6Iis5MTc5MDM5NDMyNDIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIrOTE3OTAzOTQzMjQyNDEwMzFkMWMwY2YtMTU5Ni00Y2YxLWEzZTItOWM5M2JlODA1OWM3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTM2NDN9.iIkCa6QS7AQHNnibuGbjlg8uLj1bWaCZ_2xfnAosOlk",
            "orgurl:test.theclassroom.biz"})
    @POST("login/virtual-signin")
    Call<PostSignInTeacherResponse> signInTeacherCall(@Body PostSignInTeacherRequest postSignInTeacherRequest);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDMyLCJwaG9uZSI6IjIwMzk0OTk4NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDk5ODUyNDMyNjgyN2M1YjItNjNiYi00NmM1LWEzMGQtZWU0ZDBmZWRhYTAzIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTUyODJ9.8cTOyFdmgvR2xrGY3eZMD8gtzKVXCG9li9Y2lMnJQ0c",
            "orgurl:test.theclassroom.biz"})
    @POST("login/virtual-signin")
    Call<PostSignInStudentResponse> signInStudentCall(@Body PostSignInStudentRequest postSignInStudentRequest);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @GET("admin-library/filterSubject")
    Call<List<GetSubjectFilterAdminResponse>> getSubjFiltrAdCall();

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @GET("admin-library/filterChapter")
    Call<List<GetChapterFilterAdminResponse>> getChapterFiltrAdCall(@Query("subjectId")int subjectId,@Query("standardId") int standardId);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @DELETE("admin-library/content/delete")
    Call<DeleteLibraryResponse> delLibraryCall(@Query("id")int id);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @GET("admin-library/teacher-management")
    Call<List<GetTeacherManagementResponse>> getTeacherMngmtCall(@Query("subjectId") int subjectId ,@Query("standardId") int standardId );

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @GET("admin-library/library/filters?")
    Call<List<GetAdminFilterResponse>> getAdminFiltCall(@Query("startDate") String startDate ,@Query("endDate") String endDate,@Query("type") String type );

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @GET("admin-library/library-student-filter")
    Call<List<GetAdminFilterStudentResponse>> getAdminFiltStudCall(@Query("startDate") String startDate ,@Query("endDate") String endDate,@Query("type") String type );

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDI0LCJwaG9uZSI6IjIwMzk0ODg5NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDg4OTUyNDI0ZDkwZTU4OTAtMzVjYS00OWQ5LWI3NzctM2RmNzY3ZWRlNzI3IiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTEzNTl9.9nBIDRsTtb45jC4IsgJ-hO5s02Cweq4uMgLDeWOVxOk",
            "orgurl:test.theclassroom.biz"})
    @GET("admin-library/transcodingUpdate")
    Call<GetTransCodingUpdateResponse> getTransCodeCall(@Query("filename") String filename);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDEwLCJwaG9uZSI6Iis5MTc5MDM5NDMyNDIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIrOTE3OTAzOTQzMjQyNDEwMDVhZGY4MDEtODcyYy00Mzk1LWI0NDgtYTgwNGUzZDBmNGQyIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY5MDY0NDV9.l9Zk6syaSnFFsJNKG1a3U_XC0eHIOWsdrHgrzXHWLk4",
            "orgurl:test.theclassroom.biz"})
    @POST("admin-library/engagement-history")
    Call<PostEngagementHistoryTeacherResponse> engageHistTeachCall(@Body PostEngagementHistoryTeacherRequest postEngagementHistoryTeacherRequest);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDMyLCJwaG9uZSI6IjIwMzk0OTk4NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDk5ODUyNDMyNjgyN2M1YjItNjNiYi00NmM1LWEzMGQtZWU0ZDBmZWRhYTAzIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4OTUyODJ9.8cTOyFdmgvR2xrGY3eZMD8gtzKVXCG9li9Y2lMnJQ0c",
            "orgurl:test.theclassroom.biz"})
    @POST("admin-library/engagement-history")
    Call<PostEngagementHistoryStudentResponse> engageHistStudCall(@Body PostEngagementHistoryStudentRequest postEngagementHistoryStudentRequest);

}
