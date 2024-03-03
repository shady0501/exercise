load ex2data1.txt
N = length(ex2data1);
ids = randperm(N);
cost_diff = 1;
alpha = 0.01;
threshold = 1e-6;
% theta = [0.1; 0.2; -0.1];
theta = zeros(3, 1);

X = ex2data1(ids,1:2);
max_min_diff = max(X) - min(X);
norm1_X = (X - max_min_diff) ./ max_min_diff;
% mean_X = mean(X);
% var_X = var(X);
% norm2_X = (X - mean_X) ./ var_X;
norm_X = [norm1_X, ones(N,1)];

y = ex2data1(ids, 3);
costNumber = cost(norm_X',y',theta);
cost_dat = costNumber;
while cost_diff > threshold
    theta = theta - alpha / N * norm_X' * (1 ./ (1 + exp(-theta' * norm_X')) - y')';
    cur_cost = cost(norm_X',y',theta);
    cost_dat = [cost_dat, cur_cost];
    cost_diff = abs(cur_cost - costNumber);
    cur_cost, costNumber, cost_diff
    costNumber = cur_cost;
end

figure(1);
plot(cost_dat);

% Find Indices of Positive and Negative Examples
pos = find(y==1); neg = find(y == 0);
figure(2);
% Plot Examples
plot(X(pos, 1), X(pos, 2), 'k+','LineWidth', 2, ...
'MarkerSize', 7);
hold on;
plot(X(neg, 1), X(neg, 2), 'ko', 'MarkerFaceColor', 'y', ...
'MarkerSize', 7);
hold on;
X1 = 0:2:100;
X2 = -theta(1)/theta(2) * X1 - theta(3)/theta(2);
plot(X1, X2);
