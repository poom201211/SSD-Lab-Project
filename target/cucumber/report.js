$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/snake.feature");
formatter.feature({
  "line": 1,
  "name": "As a election commissioner",
  "description": "I want to calculate the total votes",
  "id": "as-a-election-commissioner",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2251125,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "a snake exist with size 4 block",
  "keyword": "Given "
});
formatter.match({
  "location": "SnakeDef.a_snake_exist()"
});
formatter.result({
  "duration": 156752063,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "as-a-election-commissioner;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "after eating 10 apples the size should be 14 blocks",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 13
    },
    {
      "val": "14",
      "offset": 42
    }
  ],
  "location": "SnakeDef.after_eating_apples_the_size_should_be_blocks(int,int)"
});
formatter.result({
  "duration": 7873651,
  "status": "passed"
});
});