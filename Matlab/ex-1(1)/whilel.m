function [thetaAns,n] = whilel(theta,alpha,m,x,y)
cost = costFunction(m,theta,x,y);
lastcost = cost;
num = 1;
n = 0;
while num > 0.00001
    theta = GradientDescent(theta,alpha,m,x,y);
    disp('theta');
    disp(theta);
    cost = costFunction(m,theta,x,y);
    num = lastcost - cost;
    disp('num');
    disp(num);
    lastcost = cost;
    disp('cost');
    disp(cost);
    n = n+1;
    disp('n');
    disp(n);
    thetaAns = theta;
end
end