import React from 'react';
import DocumentTitle from 'react-document-title';
import { Link } from 'react-router';
import { t } from 'localizify';

import auth from '../../auth';
import User from './user';

const DashboardPage = React.createClass({
  render() {
      
  
    var token = auth.getToken().substr(1,90);
    
    const name = auth.getName();

    return (
      <DocumentTitle title={t('Personal page')}>
        <div>
        
        <div className="panel panel-info">      
        <div className="panel-heading">DashBoard</div>
        <div className="panel-body">
        
          <User dashboard={true} params={{ name }} />
          <div>
          
          <div className="row">
          <div className="col-md-12">
          
          <div className="panel panel-info">      
          <div className="panel-heading">Token Info</div>
          <div className="panel-body">
            <span className="text-success">{t('Your Truncated Token')}:</span><br/>
            <br/>
            <span className="text-danger">
            <h6>{token}</h6>
            </span>
            <br />
            <br />
            <span className="text-info"><Link to="changepassword">{t('Change Password')}</Link></span>
            </div>
            </div>
            </div>
          </div>
        </div>
        </div>
        </div>
        </div>
      </DocumentTitle>
    )
  }
});

export default DashboardPage;