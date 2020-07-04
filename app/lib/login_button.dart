import 'package:flutter/material.dart';

import './status_page.dart';

class LoginButton extends StatelessWidget {
  Future navigateToStatusPage(context) async {
    Navigator.push(
        context, MaterialPageRoute(builder: (context) => StatusPage()));
  }

  @override
  Widget build(BuildContext context) {
    return RaisedButton(
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
        navigateToStatusPage(context);
      },
    );
  }
}
