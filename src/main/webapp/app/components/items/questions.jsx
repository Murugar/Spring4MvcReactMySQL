import React from 'react';
import $ from 'jquery';
import { t } from 'localizify';

import Question from './question';
import Loader from '../utils/loader';

import QuestionService from '../../services/question';

import Bootstrap from 'bootstrap/dist/css/bootstrap.css';

const Questions = React.createClass({
  getInitialState() {
    return {
      questions: [],
      loading: true
    };
  },
  componentDidMount() {
    const tag = this.props.tag || false;
    const service = new QuestionService();

    if (tag) {
      service.getByTag(tag).then(questions => {
        this.setState({ questions, loading: false });
      });
    } else {
       service.get().then(questions => {
         this.setState({ questions, loading: false });
       });     
    }
  },
  render() {
    if (this.state.loading) {
      return ( <Loader isActive="true" /> );
    }

    const data = this.state.questions;
    const tag = this.props.tag;

    if (!data || !data.length) {
      return (<div>{t('Questions hasn\'t exist yet')}</div>);
    }

    return (
      <div>
      
      <div className="panel panel-primary">
      
      <div className="panel-heading">Questions List</div>
      
      <div className="panel-body">
      
        { tag && (<h2 className="text-danger">{t('Questions by tag «{tag}»', { tag })}</h2>) }
        <div className="question-list">
          {data.map((item, index) => 
            <div key={index}>
              <Question data={item} />
            </div>
          )}
        </div>
        
        </div>
        </div>
        
      </div>
    );
  }
});

export default Questions;
