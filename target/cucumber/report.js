$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/block.feature");
formatter.feature({
  "line": 1,
  "name": "As a block",
  "description": "I want to be able to interact with other existing blocks",
  "id": "as-a-block",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1710316,
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
  "name": "a block with position x \u003d 5 and y \u003d 5.",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    },
    {
      "val": "5",
      "offset": 36
    }
  ],
  "location": "BlockDef.createBlock(int,int)"
});
formatter.result({
  "duration": 121244964,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "as-a-block;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "overlapping blocks at position x \u003d 5 and y \u003d 5 will return true",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 35
    },
    {
      "val": "5",
      "offset": 45
    }
  ],
  "location": "BlockDef.overLappingTest(int,int)"
});
formatter.result({
  "duration": 4806023,
  "status": "passed"
});
formatter.uri("features/snake.feature");
formatter.feature({
  "line": 1,
  "name": "As a snake",
  "description": "I want to be able to grow",
  "id": "as-a-snake",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17140,
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
  "name": "a snake exist with size 4 block at position x \u003d 5 and y \u003d 10.",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 48
    },
    {
      "val": "10",
      "offset": 58
    }
  ],
  "location": "SnakeDef.createSnake(int,int)"
});
formatter.result({
  "duration": 849323,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "as-a-snake;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "after eating 10 apples the size should be 14 blocks.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "after eating 5 apples the size should be 19 blocks.",
  "keyword": "And "
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
  "location": "SnakeDef.testSnakeExpand(int,int)"
});
formatter.result({
  "duration": 128730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 13
    },
    {
      "val": "19",
      "offset": 41
    }
  ],
  "location": "SnakeDef.testSnakeExpand(int,int)"
});
formatter.result({
  "duration": 98826,
  "status": "passed"
});
formatter.before({
  "duration": 21151,
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
  "name": "a snake exist with size 4 block at position x \u003d 5 and y \u003d 10.",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 48
    },
    {
      "val": "10",
      "offset": 58
    }
  ],
  "location": "SnakeDef.createSnake(int,int)"
});
formatter.result({
  "duration": 106120,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "as-a-snake;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "it\u0027s position would be at x \u003d 5 and y \u003d 10.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 30
    },
    {
      "val": "10",
      "offset": 40
    }
  ],
  "location": "SnakeDef.testPosition(int,int)"
});
formatter.result({
  "duration": 120342,
  "status": "passed"
});
});