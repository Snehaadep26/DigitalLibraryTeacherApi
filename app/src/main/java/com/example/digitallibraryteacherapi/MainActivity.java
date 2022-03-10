package com.example.digitallibraryteacherapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.digitallibraryteacherapi.DLTeacherApi.ApiClient;
import com.example.digitallibraryteacherapi.DLTeacherApi.DeleteLibraryResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.GetAdminFilterResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.GetAdminFilterStudentResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.GetChapterFilterAdminResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.GetSubjectFilterAdminResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.GetTeacherManagementResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.GetTransCodingUpdateResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.LogInService;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostEngagementHistoryStudentRequest;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostEngagementHistoryStudentResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostEngagementHistoryTeacherRequest;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostEngagementHistoryTeacherResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostSignInAdminRequest;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostSignInAdminResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostSignInStudentRequest;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostSignInStudentResponse;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostSignInTeacherRequest;
import com.example.digitallibraryteacherapi.DLTeacherApi.PostSignInTeacherResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    PostSignInAdminRequest postSignInAdminRequest;
    PostSignInAdminResponse postSignInAdminResponse;
    PostSignInTeacherRequest postSignInTeacherRequest;
    PostSignInTeacherResponse postSignInTeacherResponse;
    PostSignInStudentRequest postSignInStudentRequest;
    PostSignInStudentResponse postSignInStudentResponse;
    List<GetSubjectFilterAdminResponse> getSubjectFilterAdminResponse;
    List<GetChapterFilterAdminResponse> getChapterFilterAdminResponse;
    List<GetTeacherManagementResponse> getTeacherManagementResponses;
    DeleteLibraryResponse deleteLibraryResponse;
    List<GetAdminFilterResponse> getAdminFilterResponses;
    List<GetAdminFilterStudentResponse> getAdminFilterStudentResponses;
    GetTransCodingUpdateResponse getTransCodingUpdateResponse;
    PostEngagementHistoryTeacherRequest postEngagementHistoryTeacherRequest;
    PostEngagementHistoryTeacherResponse postEngagementHistoryTeacherResponse;
    PostEngagementHistoryStudentRequest postEngagementHistoryStudentRequest;
    PostEngagementHistoryStudentResponse postEngagementHistoryStudentResponse;
    Retrofit retrofit;
    LogInService logInService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInIt();
        postSignInAdmin();
        postSignInTeacher();
        postSignInStudent();
        getSubjFiltertAdmin();
        getChapterFiltrAdmin();
        deleteLibAdm();
        getTeachermgmt();
          getAdminFilter();
          getAdminFilterStud();
        getTransCodeUpdate();
        postEngageHisTeac();
         postEngageHisStud();

    }

    public void postSignInAdmin()
    {
        postSignInAdminRequest =new PostSignInAdminRequest("aman.data@brigosha.com","1234",true);
        Call<PostSignInAdminResponse> call=logInService.signInAdminCall(postSignInAdminRequest);
        call.enqueue(new Callback<PostSignInAdminResponse>() {
            @Override
            public void onResponse(Call<PostSignInAdminResponse> call, Response<PostSignInAdminResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                postSignInAdminResponse=response.body();
                Toast.makeText(getApplicationContext(), postSignInAdminResponse.show.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PostSignInAdminResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error sign in admin", Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void postSignInTeacher()
    {
        postSignInTeacherRequest=new PostSignInTeacherRequest("aman.data@brigosha.com","1234",true);
        Call<PostSignInTeacherResponse> call=logInService.signInTeacherCall(postSignInTeacherRequest);
        call.enqueue(new Callback<PostSignInTeacherResponse>() {
            @Override
            public void onResponse(Call<PostSignInTeacherResponse> call, Response<PostSignInTeacherResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
                }
                postSignInTeacherResponse=response.body();
                Toast.makeText(getApplicationContext(), postSignInTeacherResponse.show.type, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<PostSignInTeacherResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error sign in teacher", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void postSignInStudent()
    {
        postSignInStudentRequest=new PostSignInStudentRequest("aman.data@brigosha.com","1234",true);
        Call<PostSignInStudentResponse> call=logInService.signInStudentCall(postSignInStudentRequest);
        call.enqueue(new Callback<PostSignInStudentResponse>() {
            @Override
            public void onResponse(Call<PostSignInStudentResponse> call, Response<PostSignInStudentResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                postSignInStudentResponse=response.body();
                Toast.makeText(getApplicationContext(), postSignInStudentResponse.show.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PostSignInStudentResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error  sign in student", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getSubjFiltertAdmin()
    {
        Call<List<GetSubjectFilterAdminResponse>> call=logInService.getSubjFiltrAdCall();
        call.enqueue(new Callback<List<GetSubjectFilterAdminResponse>>() {
            @Override
            public void onResponse(Call<List<GetSubjectFilterAdminResponse>> call, Response<List<GetSubjectFilterAdminResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getSubjectFilterAdminResponse=response.body();
                GetSubjectFilterAdminResponse response1=getSubjectFilterAdminResponse.get(1);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.color), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<List<GetSubjectFilterAdminResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error get subject filter", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getChapterFiltrAdmin()
    {
        Call<List<GetChapterFilterAdminResponse>> call=logInService.getChapterFiltrAdCall(33,44);
        call.enqueue(new Callback<List<GetChapterFilterAdminResponse>>() {
            @Override
            public void onResponse(Call<List<GetChapterFilterAdminResponse>> call, Response<List<GetChapterFilterAdminResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getChapterFilterAdminResponse=response.body();
                GetChapterFilterAdminResponse response1=getChapterFilterAdminResponse.get(1);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.name), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<GetChapterFilterAdminResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error chapter Admin", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void deleteLibAdm()
    {
        Call<DeleteLibraryResponse> call=logInService.delLibraryCall(3156);
        call.enqueue(new Callback<DeleteLibraryResponse>() {
            @Override
            public void onResponse(Call<DeleteLibraryResponse> call, Response<DeleteLibraryResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                deleteLibraryResponse=response.body();
                Toast.makeText(getApplicationContext(), deleteLibraryResponse.show.message, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<DeleteLibraryResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error delete library", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getTeachermgmt()
    {
        Call<List<GetTeacherManagementResponse>> call=logInService.getTeacherMngmtCall(3,57);
        call.enqueue(new Callback<List<GetTeacherManagementResponse>>() {
            @Override
            public void onResponse(Call<List<GetTeacherManagementResponse>> call, Response<List<GetTeacherManagementResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getTeacherManagementResponses=response.body();
                GetTeacherManagementResponse response1=getTeacherManagementResponses.get(2);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.email), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<GetTeacherManagementResponse>> call, Throwable t) {

            }
        });
    }
    public void getAdminFilter()
    {
        Call<List<GetAdminFilterResponse>> call=logInService.getAdminFiltCall("2021-09-09","2021-09-15","week");
        call.enqueue(new Callback<List<GetAdminFilterResponse>>() {
            @Override
            public void onResponse(Call<List<GetAdminFilterResponse>> call, Response<List<GetAdminFilterResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAdminFilterResponses=response.body();
                GetAdminFilterResponse response1=getAdminFilterResponses.get(2);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.date), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<GetAdminFilterResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in get Admin filter", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getAdminFilterStud()
    {
        Call<List<GetAdminFilterStudentResponse>> call=logInService.getAdminFiltStudCall("2021-09-01","2021-09-07","month");
        call.enqueue(new Callback<List<GetAdminFilterStudentResponse>>() {
            @Override
            public void onResponse(Call<List<GetAdminFilterStudentResponse>> call, Response<List<GetAdminFilterStudentResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAdminFilterStudentResponses=response.body();
                GetAdminFilterStudentResponse response1=getAdminFilterStudentResponses.get(3);
                Toast.makeText(getApplicationContext(), response1.month, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<GetAdminFilterStudentResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error admin student", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getTransCodeUpdate()
    {
        Call<GetTransCodingUpdateResponse> call=logInService.getTransCodeCall("4cb2509d-70f5-435e-8792-d24937743b53/308b8195-1b37-4e0c-ab6b-908c77234f2a1643880181724.mp4");
        call.enqueue(new Callback<GetTransCodingUpdateResponse>() {
            @Override
            public void onResponse(Call<GetTransCodingUpdateResponse> call, Response<GetTransCodingUpdateResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getTransCodingUpdateResponse=response.body();
                Toast.makeText(getApplicationContext(), getTransCodingUpdateResponse.show.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetTransCodingUpdateResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in Transcode update", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void postEngageHisTeac()
    {
        List<Integer>  libId=new ArrayList<>();
        libId.add(628);

        postEngagementHistoryTeacherRequest=new PostEngagementHistoryTeacherRequest((ArrayList<Integer>) libId,"engagement");
        Call<PostEngagementHistoryTeacherResponse> call=logInService.engageHistTeachCall(postEngagementHistoryTeacherRequest);
        call.enqueue(new Callback<PostEngagementHistoryTeacherResponse>() {
            @Override
            public void onResponse(Call<PostEngagementHistoryTeacherResponse> call, Response<PostEngagementHistoryTeacherResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                postEngagementHistoryTeacherResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(postEngagementHistoryTeacherResponse.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PostEngagementHistoryTeacherResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error in history teacher", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void postEngageHisStud()
    {
        List<Integer>  libId=new ArrayList<>();
        libId.add(628);

        postEngagementHistoryStudentRequest=new PostEngagementHistoryStudentRequest((ArrayList<Integer>) libId,"engagement");
        Call<PostEngagementHistoryStudentResponse> call=logInService.engageHistStudCall(postEngagementHistoryStudentRequest);
        call.enqueue(new Callback<PostEngagementHistoryStudentResponse>() {
            @Override
            public void onResponse(Call<PostEngagementHistoryStudentResponse> call, Response<PostEngagementHistoryStudentResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                postEngagementHistoryStudentResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(postEngagementHistoryStudentResponse.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PostEngagementHistoryStudentResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error in history teacher", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void apiInIt()
    {
        retrofit= ApiClient.getRetrofit();
        logInService=ApiClient.getLoginService();
    }

}