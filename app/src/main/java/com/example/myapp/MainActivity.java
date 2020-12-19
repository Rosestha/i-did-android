package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //so this on create is like the main()
    //ignore the bundle savedinstance state
    //ignore the super
    //ignore set content view


    Button a;
    Button bts;

    EditText myInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //so a banaiyo mathi
        //ani we link it with rojeshnaIsDon which is the id
        //done? yess
        a = findViewById(R.id.rojeshnaIsDon);
        bts = findViewById(R.id.rojeshnaIsBts);
        myInput=findViewById(R.id.rojeshnaET);
        //
        //aba click garna paryo hai? kaa
        //i mean button banyio
        //ani button ko uta id diyo
        //ani eta Button a, banayera we link it
        //eti garey aba link huncha ?
        // = findVIewById xa ni tyo findViewbyId will link it with the ID
        //no matter what you make, findViewById vanera link garni ho
        //i mean you see tyo android ma button ayo ani you can click it
        //but click vayesi kei ta trigger huna paryo ni right?
        //yess
        //so triiger it we already have sabai kura haru like this

        //synatx is
        // a . setOnclickListener (new OnClickListtener)


//        a.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //it is fun because sabai kura afai aauxa dherai type garna pardaina
//                //aba yo onclick ma you should write click garesi k garni vanera
//                //yo onclick is the region where you put the action
//                //try to put Log.i eta
//                //Log.i matra dada ki all the things
//                //just log
//                Log.i("v","I just clicked a button");
//
//            }
//        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = 5+2;
                Toast.makeText(MainActivity.this, "My total is"+sum, Toast.LENGTH_SHORT).show();
            }
        });

        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String text = myInput.getText().toString();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });







        //so lets add sum of two numbers
//        sum(3,4);

        //vote
        //canVote(13);

        //eta call it ani comment mathi ko can vote
        avg(23,45,33);
    }
    //hus serch hai

    private void canVote(int age){
        if (age>16){
            Log.i("value", "Sir you can vote");
        }else {
            Log.i("value","You are a baby");
        }
    }

    private void avg(int a,int b,int c) {
        int d = (a + b + c) / 3;
        //aba here log
        //capitalL

        //esto ho hai
        //java has like uppercase lowercase sensitivity
        //so Log is tei matrai it cant be log
        //ani enter hanesi darauna pardaina, you can still do log like

//        Log.i(
//                "asdasd",
//
//
//
//
//                "a"
//        );

//        it is same kura

        // the only thing that matters is, ( ra ) ko bich ma 2ta kura huna paryo sparated by comma

        //so aba gara tala

//        Log.i( g)

        //eh ani esma xai ma pani paile confuse hunthey
        //you dont have to type grey stuffs
        //yo afai ako indicator ho
        //look closely
        //"oohh
        //yessssss it is there to let you kknow ki timle k ko value hairako ho
        //makes it easy
//        Log.i()


        //so try again
        //dada d ka ?
        //eh so aba java ma you can add strings and number
        //your value is int, ani tyo msg of the avg value is wala is string so tyo string msg ko end ma gayera just + ani your value
        Log.i("v1","The average value is "+d);
        //eti ho
//        ani try to put the tag name, like kei random,empty garyo vani feri ka harauxa vetdaina
        //aba run it ani search for v1 in the logcat

        //but timle  yo avg wala function call gareko xaina hola onCreate ma



    }

    private void sum(int a, int b){
        int c = a+b;
        //cout ko equivalent xai System.out.printLn(); ho la
        Log.i("value",c+"");
        System.out.println(c);
    }
}