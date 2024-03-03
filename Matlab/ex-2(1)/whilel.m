function [costAns,theta] = whilel(X,y,theta,alpha)
         num = 1;
         m = length(y);
         costNumber = cost(X,y,theta);
         while num > 0.001
             theta = theta - alpha / m * X * (1 ./ (1 + exp(-theta' * X)) - y)';
             disp('num1');
             disp(num);
             num = cost(X,y,theta) - costNumber;
             disp('num2');
             disp(num);
         end
         costAns = costNumber;
end
% J = cost(X,y,theta)