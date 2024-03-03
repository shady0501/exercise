function J = costFunction(m,theta,x,y)
         middle = (theta'*x -y)*(theta'*x -y)';
         J = 1/2/m * middle;
         
end