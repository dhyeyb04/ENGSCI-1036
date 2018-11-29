clear
clc
close all

%Instantiate constants and variables
g = 9.8;
theta = 60;
vi = 35;
ti = 0;

%Calculate components
vix = vi*cosd(theta);
viy = (vi*sind(theta)) - (g*ti);

%Store in an array and output
v = [vix, viy]

%Compute trajectory
%Calculate how long object will be in flight
tmax = (2*vi*sind(theta))/g;

%Create an evenly spaced vector of 250 time points between t = 0 and t = tmax
timePoints = linspace(ti, tmax, 250);

%Create vectors for x and y displacement at each time point
xdisp = linspace(ti, tmax, 250);
ydisp = linspace(ti, tmax, 250);

n = 1;
while n <= length(xdisp) %Fill all values until 250 displacement values in each dimension
    xdisp(n) = vi*timePoints(n)*cosd(theta);
    ydisp(n) = (vi*timePoints(n)*sind(theta))-(0.5*g*(timePoints(n)^2));
    n = n + 1;
end

%Plot out graph of motion
figure('Name','Projectile Motion')
plot(xdisp, ydisp);
title ("Projectile Motion");
xlabel ("x distance");
ylabel ("y distance");


