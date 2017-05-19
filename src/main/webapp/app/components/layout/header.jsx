import React from 'react';
import { Link } from 'react-router';
import { t } from 'localizify';

import LanguageSwitcher from '../utils/language-switcher';

var Header = React.createClass({
  render() {
    return (
      <header id="header" className="bg-success">
        <div className="header-wrap bg-success">
          <div className="header">
            <ul id="menu" className="menu">
              <li className="li logo">
                <Link to="/" className="blue south" activeClassName="active" title="export-default">
                  <strong><i className="fa fa-bug" aria-hidden="true"></i> export-default
                  </strong>
                </Link>
              </li>
              <li className="li"><Link to="/add" activeClassName="active">{t('Add')}</Link></li>
              <li className="li"><Link to="/tags" activeClassName="active">{t('Tags')}</Link></li>
              <li className="li"><Link to="/dashboard" activeClassName="active">{t('Profile')}</Link></li>
              <li className="li right"><LanguageSwitcher /></li>
              <li title={"You are " + (this.props.loggedIn ? '' : 'not') + " logged in."} className="li right">  
                {this.props.loggedIn ? (

                  <span>{t('Hi')}, <b>{localStorage.name}</b><Link to="/logout">
                  <u>{t('Logout')}</u></Link></span>
                  
                ) : (
                  <span>
                    <Link to="/login" activeClassName="active">{t('Login')}</Link>
                    <Link to="/signup" activeClassName="active">{t('Sign up')}</Link>
                  </span>
                )}
              </li>
            </ul>
          </div>
        </div>
      </header>
    );
  }
});

export default Header;