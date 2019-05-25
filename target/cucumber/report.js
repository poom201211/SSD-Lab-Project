$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/block.feature");
formatter.feature({
  "line": 1,
  "name": "As a block",
  "description": "I want to be able to interact with other existing blocks.",
  "id": "as-a-block",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1541837,
  "status": "passed"
});
formatter.before({
  "duration": 3481532,
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
  "duration": 174077305,
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
  "name": "overlapping blocks at position x \u003d 5 and y \u003d 5 will return true.",
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
  "duration": 6378127,
  "status": "passed"
});
formatter.uri("features/game.feature");
formatter.feature({
  "line": 1,
  "name": "As a snake game",
  "description": "I want players to be able to play my game.",
  "id": "as-a-snake-game",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26621,
  "status": "passed"
});
formatter.before({
  "duration": 19692,
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
  "name": "the right key was pressed.",
  "keyword": "Given "
});
formatter.match({
  "location": "GameDef.makeSnakeTurnRight()"
});
formatter.result({
  "duration": 44855,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "as-a-snake-game;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the snakes head would be pointing right.",
  "keyword": "Then "
});
formatter.match({
  "location": "GameDef.overLappingTest()"
});
formatter.result({
  "duration": 152433,
  "status": "passed"
});
formatter.uri("features/map.feature");
formatter.feature({
  "line": 1,
  "name": "As a map",
  "description": "I want to be able to fit peoples screen size and preference.",
  "id": "as-a-map",
  "keyword": "Feature"
});
formatter.before({
  "duration": 40479,
  "status": "passed"
});
formatter.before({
  "duration": 55430,
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
  "name": "a game map with size 50.",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 21
    }
  ],
  "location": "MapDef.createMap(int)"
});
formatter.result({
  "duration": 210416,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "as-a-map;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the size of the map should be 50.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 30
    }
  ],
  "location": "MapDef.testMapSize(int)"
});
formatter.result({
  "duration": 132011,
  "status": "passed"
});
formatter.uri("features/snake.feature");
formatter.feature({
  "line": 1,
  "name": "As a snake",
  "description": "I want to be able to grow.",
  "id": "as-a-snake",
  "keyword": "Feature"
});
formatter.before({
  "duration": 33186,
  "status": "passed"
});
formatter.before({
  "duration": 29903,
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
  "duration": 247248,
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
  "duration": 199111,
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
  "duration": 188171,
  "status": "passed"
});
formatter.before({
  "duration": 33550,
  "status": "passed"
});
formatter.before({
  "duration": 40843,
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
  "duration": 189994,
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
  "duration": 183430,
  "status": "passed"
});
});