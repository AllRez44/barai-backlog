using Back.Models;
using Microsoft.EntityFrameworkCore;

namespace Back.Data;

public class ApiDbContext : DbContext
	{
	public ApiDbContext(DbContextOptions<ApiDbContext> options) : base(options)
		{

		}
	public DbSet<User> Users { get; set; }
	}