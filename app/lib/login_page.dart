import 'package:flutter/material.dart';

import './status_page.dart';

class LoginPage extends StatefulWidget {
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  // The strings which contain inputs from username and password
  String userInput = '';
  String passInput = '';

  // The function which navigates to the status page
  Future navigateToStatusPage(context) async {
    Navigator.push(
        context, MaterialPageRoute(builder: (context) => StatusPage()));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.blue[700],
      body: Container(
        child: SingleChildScrollView(
          child: Column(
            children: <Widget>[
              SizedBox(height: 100.0),
              Text(
                'Micron UV robot',
                style: TextStyle(
                  color: Colors.white,
                  fontWeight: FontWeight.bold,
                  fontSize: 40,
                ),
              ),
              SizedBox(height: 250.0),

              // Username
              Padding(
                padding: new EdgeInsets.fromLTRB(50, 10, 50, 10),
                child: Container(
                  alignment: Alignment.centerLeft,
                  decoration: BoxDecoration(
                    color: Color(0xFF6CA8F1),
                    borderRadius: BorderRadius.circular(10.0),
                    boxShadow: [
                      BoxShadow(
                        color: Colors.black12,
                        blurRadius: 6.0,
                        offset: Offset(0, 2),
                      ),
                    ],
                  ),
                  height: 60.0,
                  child: TextField(
                    style: TextStyle(
                      color: Colors.white,
                    ),
                    decoration: InputDecoration(
                      border: InputBorder.none,
                      contentPadding: EdgeInsets.only(top: 14.0),
                      prefixIcon: Icon(
                        Icons.account_box,
                        color: Colors.white,
                      ),
                      hintText: 'Enter your username',
                      hintStyle: TextStyle(
                        color: Colors.white54,
                      ),
                    ),
                    onSubmitted: (String str) {
                      setState(() {
                        userInput = str;
                      });
                    },
                  ),
                ),
              ),

              // Password
              Padding(
                padding: new EdgeInsets.fromLTRB(50, 10, 50, 10),
                child: Container(
                  alignment: Alignment.centerLeft,
                  decoration: BoxDecoration(
                    color: Color(0xFF6CA8F1),
                    borderRadius: BorderRadius.circular(10.0),
                    boxShadow: [
                      BoxShadow(
                        color: Colors.black12,
                        blurRadius: 6.0,
                        offset: Offset(0, 2),
                      ),
                    ],
                  ),
                  height: 60.0,
                  child: TextField(
                    obscureText: true,
                    style: TextStyle(
                      color: Colors.white,
                    ),
                    decoration: InputDecoration(
                      border: InputBorder.none,
                      contentPadding: EdgeInsets.only(top: 14.0),
                      prefixIcon: Icon(
                        Icons.lock,
                        color: Colors.white,
                      ),
                      hintText: 'Enter your password',
                      hintStyle: TextStyle(
                        color: Colors.white54,
                      ),
                    ),
                    onSubmitted: (String str) {
                      setState(() {
                        passInput = str;
                      });
                    },
                  ),
                ),
              ),

              SizedBox(height: 28.0),

              // Login button
              RaisedButton(
                padding: const EdgeInsets.all(10.0),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(18.0),
                ),
                child: Text(
                  'Administrator Login',
                  style: TextStyle(
                    color: Colors.white,
                    fontWeight: FontWeight.bold,
                    fontSize: 20,
                  ),
                ),
                color: Color(0xFF6CA8F1),
                onPressed: () {
                  if (userInput == "micron" && passInput == "123") {
                    navigateToStatusPage(context);
                  }
                },
              ),
            ],
          ),
        ),
      ),
    );
  }
}
