-- Last updated: 7/31/2025, 2:05:21 PM
# Write your MySQL query statement below
select * from cinema
where id%2!=0 and description!='boring'
order by rating desc;