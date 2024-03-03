function plotfunction(x,y,theta)
        figure;
        x = x(2,:);
        plot(x, y, 'rx', 'MarkerSize', 10);
        hold on;
        xlim([0,25]);
        y2 = theta(1,1) + theta(2,1)*x;
        plot(y2,x);
        ylabel('Profit in $10,000s');
        xlabel('Population of City in 10,000s');
end