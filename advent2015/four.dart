import 'dart:convert';

import 'package:convert/convert.dart';
import 'package:crypto/crypto.dart';

calc() {
  bool startsWithFiveZeroes(String s) => s.startsWith("000000");
  String generateMd5(String data) =>
      hex.encode(md5.convert(new Utf8Encoder().convert(data)).bytes);
  String input = "bgvyzdsv";
  int counter = 0;
  while (!startsWithFiveZeroes(generateMd5("$input$counter"))) {
    counter++;
  }
  print(counter);
}
