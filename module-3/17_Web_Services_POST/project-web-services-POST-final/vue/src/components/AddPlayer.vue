<template>
    <div>
        <!--
        <div v-if="statusMessage != ''" class="alert alert-success" role="alert">
              {{statusMessage}}
        </div> -->
        <form v-on:submit.prevent="sendForm">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" v-model="newPlayer.firstName">
            </div>
            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" v-model="newPlayer.lastName">
            </div>
            <div class="mb-3">
                <label for="jerseyNumber" class="form-label">Jersey Number</label>
                <input type="text" class="form-control" id="jerseyNumber" v-model.number="newPlayer.jerseyNumber">
            </div>
            <div class="mb-3">
                <label for="salary" class="form-label">Salary</label>
                <input type="text" class="form-control" id="salary" v-model.number="newPlayer.salary">
            </div>
            <select v-model="selectedValue" class="form-select" aria-label="Default select example">
               <option v-for="option in options"
                   v-bind:value="option.value"
                   v-bind:key="option.value">
                   {{ option.text }}
                </option>
            </select>
            <div class="mb-3">
                <label for="imageUrl" class="form-label">Image Url</label>
                <input type="text" class="form-control" id="imageUrl">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</template>

<script>

import playerService from '../services/PlayerService.js';

export default {


    data() {
        return {

           newPlayer: {
              imageUrl: 'https://res.cloudinary.com/drr6cwmiz/image/upload/v1701191329/mystery_exnajf.webp',
              teamId: 1,
              positions: []
           },

           statusMessage: '',

           selectedValue: '',

           options: [
             { value: "", text: ""},
             { value: "Pitcher", text: "Pitcher"},
             { value: "Catcher", text: "Catcher"},
           ]

        }
    },
    methods: {

        sendForm() {
           //set the player position from selected value
           this.newPlayer.positions[0] = this.selectedValue;

           playerService.addPlayer(this.newPlayer).then( (response) => {

            console.log(response.data);
            
           // this.statusMessage = 'Player ' + response.data.playerId + ' was added successfully'
            this.newPlayer = {};

            // send back to the search page
            this.$router.push('search');

           })
           .catch( (error) => {
            console.log(error)
           } );


        }


    }



}





</script>

<style></style>