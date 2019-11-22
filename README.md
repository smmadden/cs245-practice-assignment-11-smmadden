# cs245-practice-assignment-11-smmadden-

Implements a function to find the judge in a town.

In a town, there are N people. There is a rumor that one of these people is secretly the town judge. If the town judge exists, then:

   1.The town judge trusts nobody.
   2.Everybody (except for the town judge) trusts the town judge.
   3.There is exactly one person that satisfies properties 1 and 2.


The function parameters are ​trust​ — an array of pairs ​trust[i] = [a, b]​ representing that the person labelled ​a trusts the person labelled ​b​ — and integer N representing the number of people in the town.
If the town judge exists and can be identified, the function returns the label of the town judge. Otherwise, it returns ​-1​.
