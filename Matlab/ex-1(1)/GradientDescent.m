function theta = GradientDescent(theta,alpha,m,x,y)
        theta = theta - alpha/m * (x * (theta'*x-y)');
end