function J = cost(X,y,theta)
         sigmoidnumber = sigmoid(theta'*X);
         m = length(y);
         J = 0;
         for i = 1:m
             J = J - y(i)*log(sigmoidnumber(i))-(1-y(i))*log(1-sigmoidnumber(i));
         end
         J = J/m;
end