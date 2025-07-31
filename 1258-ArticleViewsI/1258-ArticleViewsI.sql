-- Last updated: 7/31/2025, 2:04:24 PM
# Write your MySQL query statement below
select distinct(author_id) as id from views
where author_id=viewer_id
order by author_id;
