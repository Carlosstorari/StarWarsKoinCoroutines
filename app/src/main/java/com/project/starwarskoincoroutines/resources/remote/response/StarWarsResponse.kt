package com.project.starwarskoincoroutines.resources.remote.response

import com.project.starwarskoincoroutines.domain.model.People

data class StarWarsResponse (val results: List<People>)