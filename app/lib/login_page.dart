import 'package:flutter/material.dart';

class LoginPage extends StatefulWidget {
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.blue[700],
      body: Column(
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
          SizedBox(height: 280.0),
          // Text("Test"),
          Username(),
          Password(),
          SizedBox(height: 10.0),
          // Text("Test"),
          LoginButton(),
        ],
      ),
    );
  }
}
