#Busiest Time in The Mall

The mall management is trying to figure out what was the busiest moment in the mall in the last year.
You are given data from the door detectors: each data entry includes a timestamp (seconds in [Unix Epoch](https://en.wikipedia.org/wiki/Unix_time) format), an amount of people and whether they entered or exited.

Example of a data entry:
{ time: 1440084737,  count: 4,  type: "enter" }

Find what was the busiest period in the mall on the last year. Return an array with two [Epoch](https://en.wikipedia.org/wiki/Unix_time) timestamps representing the beginning and end of that period. You may assume that the data your are given is accurate and that each second with entries or exits is recorded. Implement the most efficient solution possible and analyze its time and space complexity.