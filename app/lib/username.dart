import 'package:flutter/material.dart';

class Username extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
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
        ),
      ),
    );
  }
}
