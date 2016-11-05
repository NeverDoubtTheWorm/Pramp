#Drone Flight Planner

You are planning the amount of fuel need to complete a drone flight.

To fly higher, the drone burns 1 liter of fuel per feet. 

However, flying lower charges the drone with the amount of energy equivalent to 1 liter of fuel for every feet. 

Flying sideways takes no energy (only flying up and down takes/charges energy).

Given an array of 3D coordinates named route, find the minimal amount of fuel the drone would need to fly through this route.

Explain and code the most efficient solution possible, with the minimal number of actions and variables.

Example:

        Completing the route 
        [ {x: 0, y: 2, z:10}, 
          {x: 3, y: 5, z: 0}, 
          {x: 9, y:20, z: 6}, 
          {x:10, y:12, z:15}, 
          {x:10, y:10, z: 8}  ] 
      requires a minimum of 5 liters of fuel.