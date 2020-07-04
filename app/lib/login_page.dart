import 'package:flutter/material.dart';

import './username.dart';
import './password.dart';
import './login_button.dart';

class LoginPage extends StatefulWidget {
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
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
              Username(),
              Password(),
              SizedBox(height: 28.0),
              LoginButton(),
            ],
          ),
        ),
      ),
    );
  }
}
