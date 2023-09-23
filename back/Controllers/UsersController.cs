using Back.Data;
using Back.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace Back.Controllers
	{
	[ApiController]
	[Route("[controller]")]
	public class UsersController: ControllerBase
		{
		private readonly ILogger<UsersController> _logger;
		private readonly ApiDbContext _context;

		public UsersController(
			ILogger<UsersController> logger,
			ApiDbContext context)
			{
			_logger = logger;
			_context = context;
			}

		[HttpGet(Name = "GetAllUsers")]
		public async Task<IActionResult> GetUsers()
			{
			
			return Ok("teste");
			}
		}
	}
