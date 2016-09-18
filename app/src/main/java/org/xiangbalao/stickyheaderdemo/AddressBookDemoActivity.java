package org.xiangbalao.stickyheaderdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.linkvin.common.widget.stickyheaders.StickyHeaderLayoutManager;

import org.xiangbalao.stickyheaderdemo.adapter.AddressBookDemoAdapter;
import org.xiangbalao.stickyheaderdemo.model.Person;
import org.xiangbalao.stickyheaderdemo.utils.GsonUtil;

import java.util.List;

/**
 * Shows a fake addressbook listing, loaded from randomuser.me, where the people are sorted
 * into sections by the first letter of last name.
 */
public class AddressBookDemoActivity extends DemoActivity  {

	private static final String TAG = AddressBookDemoActivity.class.getSimpleName();
	AddressBookDemoAdapter adapter = new AddressBookDemoAdapter();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		recyclerView.setLayoutManager(new StickyHeaderLayoutManager());
		recyclerView.setAdapter(adapter);
	}

	@Override
	protected void onResume() {
		super.onResume();

		recyclerView.setVisibility(View.GONE);

		onRandomUsersDidLoad(getData());

	}


	public void onRandomUsersDidLoad(List<Person> randomUsers) {

		recyclerView.setVisibility(View.VISIBLE);

		GsonUtil.createGsonString(randomUsers);





		Log.i(AddressBookDemoActivity.class.getSimpleName(), GsonUtil.createGsonString(getData()));
		adapter.setPeople(randomUsers);
	}


	String s="[\n" +
			"    {\n" +
			"        \"cell\": \"(543)-942-9697\",\n" +
			"        \"email\": \"jamie.adams@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"shelby\",\n" +
			"            \"postcode\": \"41130\",\n" +
			"            \"state\": \"new york\",\n" +
			"            \"street\": \"8000 harrison ct\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"jamie\",\n" +
			"            \"last\": \"adams\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"(625)-563-9392\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/12.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/12.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/12.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"46754146\",\n" +
			"        \"email\": \"alfred.andersen@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"jystrup\",\n" +
			"            \"postcode\": \"92823\",\n" +
			"            \"state\": \"midtjylland\",\n" +
			"            \"street\": \"7456 rylevej\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"alfred\",\n" +
			"            \"last\": \"andersen\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"99029405\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/2.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/2.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/2.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"45460203\",\n" +
			"        \"email\": \"sofia.andersen@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"brondby\",\n" +
			"            \"postcode\": \"94383\",\n" +
			"            \"state\": \"syddanmark\",\n" +
			"            \"street\": \"6277 birke alle\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"sofia\",\n" +
			"            \"last\": \"andersen\",\n" +
			"            \"title\": \"mrs\"\n" +
			"        },\n" +
			"        \"phone\": \"88630473\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/83.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/83.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/83.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0701-526-865\",\n" +
			"        \"email\": \"grace.bates@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"norwich\",\n" +
			"            \"postcode\": \"C4 4RB\",\n" +
			"            \"state\": \"county down\",\n" +
			"            \"street\": \"1273 richmond road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"grace\",\n" +
			"            \"last\": \"bates\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"017687 05575\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/91.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/91.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/91.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0734-509-698\",\n" +
			"        \"email\": \"kimberly.burke@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"preston\",\n" +
			"            \"postcode\": \"Y27 5WU\",\n" +
			"            \"state\": \"hertfordshire\",\n" +
			"            \"street\": \"3898 windsor road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"kimberly\",\n" +
			"            \"last\": \"burke\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"016977 5023\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/5.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/5.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/5.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"(307)-967-5539\",\n" +
			"        \"email\": \"alyssa.burns@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"grand prairie\",\n" +
			"            \"postcode\": \"47719\",\n" +
			"            \"state\": \"new york\",\n" +
			"            \"street\": \"4884 spring st\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"alyssa\",\n" +
			"            \"last\": \"burns\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"(285)-974-8494\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/44.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/44.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/44.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0717-390-733\",\n" +
			"        \"email\": \"caleb.campbell@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"aberdeen\",\n" +
			"            \"postcode\": \"EX7 7GR\",\n" +
			"            \"state\": \"county tyrone\",\n" +
			"            \"street\": \"3011 london road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"caleb\",\n" +
			"            \"last\": \"campbell\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"013873 62518\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/52.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/52.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/52.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"06-16-89-15-44\",\n" +
			"        \"email\": \"logan.carpentier@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"clermont-ferrand\",\n" +
			"            \"postcode\": \"51405\",\n" +
			"            \"state\": \"aisne\",\n" +
			"            \"street\": \"1509 rue victor-hugo\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"logan\",\n" +
			"            \"last\": \"carpentier\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"04-56-88-61-57\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/31.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/31.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/31.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0719-309-888\",\n" +
			"        \"email\": \"shaun.carroll@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"brighton and hove\",\n" +
			"            \"postcode\": \"YW7R 7DG\",\n" +
			"            \"state\": \"tyne and wear\",\n" +
			"            \"street\": \"5762 windsor road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"shaun\",\n" +
			"            \"last\": \"carroll\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"015396 49242\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/53.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/53.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/53.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"(543)-942-9697\",\n" +
			"        \"email\": \"jamie.adams@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"shelby\",\n" +
			"            \"postcode\": \"41130\",\n" +
			"            \"state\": \"new york\",\n" +
			"            \"street\": \"8000 harrison ct\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"jamie\",\n" +
			"            \"last\": \"adams\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"(625)-563-9392\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/12.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/12.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/12.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"46754146\",\n" +
			"        \"email\": \"alfred.andersen@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"jystrup\",\n" +
			"            \"postcode\": \"92823\",\n" +
			"            \"state\": \"midtjylland\",\n" +
			"            \"street\": \"7456 rylevej\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"alfred\",\n" +
			"            \"last\": \"andersen\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"99029405\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/2.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/2.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/2.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"45460203\",\n" +
			"        \"email\": \"sofia.andersen@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"brondby\",\n" +
			"            \"postcode\": \"94383\",\n" +
			"            \"state\": \"syddanmark\",\n" +
			"            \"street\": \"6277 birke alle\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"sofia\",\n" +
			"            \"last\": \"andersen\",\n" +
			"            \"title\": \"mrs\"\n" +
			"        },\n" +
			"        \"phone\": \"88630473\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/83.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/83.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/83.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0701-526-865\",\n" +
			"        \"email\": \"grace.bates@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"norwich\",\n" +
			"            \"postcode\": \"C4 4RB\",\n" +
			"            \"state\": \"county down\",\n" +
			"            \"street\": \"1273 richmond road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"grace\",\n" +
			"            \"last\": \"bates\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"017687 05575\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/91.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/91.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/91.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0734-509-698\",\n" +
			"        \"email\": \"kimberly.burke@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"preston\",\n" +
			"            \"postcode\": \"Y27 5WU\",\n" +
			"            \"state\": \"hertfordshire\",\n" +
			"            \"street\": \"3898 windsor road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"kimberly\",\n" +
			"            \"last\": \"burke\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"016977 5023\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/5.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/5.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/5.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"(307)-967-5539\",\n" +
			"        \"email\": \"alyssa.burns@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"grand prairie\",\n" +
			"            \"postcode\": \"47719\",\n" +
			"            \"state\": \"new york\",\n" +
			"            \"street\": \"4884 spring st\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"alyssa\",\n" +
			"            \"last\": \"burns\",\n" +
			"            \"title\": \"ms\"\n" +
			"        },\n" +
			"        \"phone\": \"(285)-974-8494\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/women/44.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/women/44.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/women/44.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0717-390-733\",\n" +
			"        \"email\": \"caleb.campbell@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"aberdeen\",\n" +
			"            \"postcode\": \"EX7 7GR\",\n" +
			"            \"state\": \"county tyrone\",\n" +
			"            \"street\": \"3011 london road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"caleb\",\n" +
			"            \"last\": \"campbell\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"013873 62518\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/52.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/52.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/52.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"06-16-89-15-44\",\n" +
			"        \"email\": \"logan.carpentier@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"clermont-ferrand\",\n" +
			"            \"postcode\": \"51405\",\n" +
			"            \"state\": \"aisne\",\n" +
			"            \"street\": \"1509 rue victor-hugo\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"logan\",\n" +
			"            \"last\": \"carpentier\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"04-56-88-61-57\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/31.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/31.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/31.jpg\"\n" +
			"        }\n" +
			"    },\n" +
			"    {\n" +
			"        \"cell\": \"0719-309-888\",\n" +
			"        \"email\": \"shaun.carroll@example.com\",\n" +
			"        \"location\": {\n" +
			"            \"city\": \"brighton and hove\",\n" +
			"            \"postcode\": \"YW7R 7DG\",\n" +
			"            \"state\": \"tyne and wear\",\n" +
			"            \"street\": \"5762 windsor road\"\n" +
			"        },\n" +
			"        \"name\": {\n" +
			"            \"first\": \"shaun\",\n" +
			"            \"last\": \"carroll\",\n" +
			"            \"title\": \"mr\"\n" +
			"        },\n" +
			"        \"phone\": \"015396 49242\",\n" +
			"        \"picture\": {\n" +
			"            \"large\": \"https://randomuser.me/api/portraits/men/53.jpg\",\n" +
			"            \"medium\": \"https://randomuser.me/api/portraits/med/men/53.jpg\",\n" +
			"            \"thumbnail\": \"https://randomuser.me/api/portraits/thumb/men/53.jpg\"\n" +
			"        }\n" +
			"    }\n" +
			"]";

	private List<Person> getData() {



		List<Person> data = GsonUtil.stringToArray(s,Person[].class);
	//	Person[] arr = new Gson().fromJson(is, Person[].class);
		//return Arrays.asList(arr);
		return data;
	}


}
